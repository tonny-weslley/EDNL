package com.mycompany.datastructures.implementations;

import com.mycompany.datastructures.interfaces.IEdge;
import com.mycompany.datastructures.interfaces.IGraph;
import com.mycompany.datastructures.interfaces.IVertex;

import java.util.List;
import java.util.HashMap;

public class Vertex<T> implements IVertex{
    private T value;
    private List<IEdge> edges;

    public Vertex(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = (T) value;
    }
}

public class Edge<T> implements IEdge{
    private T value;
    private IVertex vertex1;
    private IVertex vertex2;
    private boolean directed;

    public Edge(T value, IVertex vertex1, IVertex vertex2, boolean directed) {
        this.value = value;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.directed = directed;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public IVertex getVertex1() {
        return vertex1;
    }

    @Override
    public IVertex getVertex2() {
        return vertex2;
    }

    @Override
    public boolean isDirected() {
        return directed;
    }

    @Override
    public void setValue(Object value) {
        this.value = (T) value;
    }

    @Override
    public void setVertex1(IVertex vertex1) {
        this.vertex1 = vertex1;
    }

    @Override
    public void setVertex2(IVertex vertex2) {
        this.vertex2 = vertex2;
    }

    @Override
    public void setDirected(boolean directed) {
        this.directed = directed;
    }
}

public class GraphAdjList<T> implements IGraph{
    public List<IVertex> vertices;
}
