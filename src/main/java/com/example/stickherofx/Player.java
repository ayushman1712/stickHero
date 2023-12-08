package com.example.stickherofx;

public class Player extends Point {
    private PlayerState state;
    private int height;
    private int width;
    private double x;
    private double y;
    private double speed;
    private double fallSpeed;
    private int cherriesCount;

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFallSpeed() {
        return fallSpeed;
    }

    public void setFallSpeed(double fallSpeed) {
        this.fallSpeed = fallSpeed;
    }

    public int getCherriesCount() {
        return cherriesCount;
    }

    public void setCherriesCount(int cherriesCount) {
        this.cherriesCount = cherriesCount;
    }
}