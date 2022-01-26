package com.example.meridiatask.models

data class Feature(
    val id: Int,
    val points: List<Point>
) {
    data class Point(
        val accuracy: Double,
        val latitude: Double,
        val longitude: Double
    )
}