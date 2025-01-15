package com.mycompany.datastructures.implementations;

public interface IVertex<T> {
    T getValue();
    void setValue(T value);
}

public interface IEdge {
    T getValue();
    IVertex getVertex1();
    IVertex getVertex2();
    boolean isDirected();
    void setValue(T value);
    void setVertex1(IVertex vertex1);
    void setVertex2(IVertex vertex2);
    void setDirected(boolean directed);
}

public interface IGraph<T> {
    void addVertex(IVertex vertex);
    void addEdge(IEdge edge);
    void removeVertex(IVertex vertex);
    void removeEdge(IEdge edge);
    List<IVertex> getVertices();
    List<IEdge> getEdges();
    IVertex getVertex(T value);
    IEdge getEdge(T value);
    boolean hasVertex(IVertex vertex);
    boolean hasEdge(IEdge edge);
    boolean hasEdge(IVertex vertex1, IVertex vertex2);
    boolean hasEdge(T value);
    boolean hasVertex(T value);
    boolean isEmpty();
    int size();
    void clear();
}