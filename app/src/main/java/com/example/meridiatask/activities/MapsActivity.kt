package com.example.meridiatask.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meridiatask.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.meridiatask.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.Polygon
import com.google.android.gms.maps.model.PolygonOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        //val url = "https://releases-f89f5.firebaseio.com"

        //Request(url).run()


    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val point1 = LatLng(5.163021, -1.601401)
        val point2 = LatLng(5.162986, -1.601316)
        val point3 = LatLng(5.162975, -1.601133)
        val point4 = LatLng(5.163016, -1.601055)
        val point5 = LatLng(5.163078, -1.600975)
        val point6 = LatLng(5.163083, -1.600775)
        val point7 = LatLng(5.163061, -1.600696)
        val point8 = LatLng(5.163073, -1.600598)
        val point9 = LatLng(5.16311, -1.600533)
        val point10 = LatLng(5.163041, -1.600331)
        val point11 = LatLng(5.163005, -1.600241)
        val point12 = LatLng(5.162999, -1.600148)
        val point13 = LatLng(5.16302, -1.600043)
        val point14 = LatLng(5.162021, -1.599648)

        val pointList = listOf(point1, point2, point3, point4, point5, point6, point7, point8, point9,
            point10, point11, point12, point13, point14)

        pointList.forEach { point ->
            mMap.addMarker(MarkerOptions().position(point).title(point.toString()))
        }

        val polygon = googleMap.addPolygon(PolygonOptions()
            .clickable(true).addAll(pointList)
       )
        fun colorPolygon(polygon: Polygon) {
            var fillColor = 0
        }
        colorPolygon(polygon)
        polygon.fillColor = Color.argb(100, 183,94,164)

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point1,15.0f))
    }
}