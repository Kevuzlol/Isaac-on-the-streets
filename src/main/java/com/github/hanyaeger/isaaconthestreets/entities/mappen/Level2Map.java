package com.github.hanyaeger.isaaconthestreets.entities.mappen;

public class Level2Map extends Map {
    @Override
    public int[][] defineMap() {
        return new int[][]{
                {99, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 99},
                {99, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 99},
                {99, 99, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 99, 99},
                {99, 99, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 99, 99},
                {99, 99, 99, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 99, 99, 99},
                {99, 99, 99, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 99, 99, 99},
                {99, 99, 99, 0, 1, 0, 0, 0, 0, 0, 12, 0, 0, 0, 1, 0, 99, 99, 99},
                {99, 99, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 0, 99, 99, 99},
                {99, 99, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 99, 99, 99},
                {99, 99, 0, 0, 1, 0, 13, 0, 0, 0, 0, 0, 0, 0, 1, 0, 99, 99, 99},
                {99, 99, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 99, 99, 99},
                {99, 99, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 99},
                {99, 99, 0, 0, 1, 0, 0, 0, 10, 0, 0, 0, 0, 0, 1, 0, 0, 0, 99},
                {99, 99, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 99},
                {99, 99, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 99, 99},
                {99, 99, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 99, 99},
                {99, 99, 99, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 99, 99},
                {99, 99, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 99, 99},
                {99, 99, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 99},
        };
    }
}