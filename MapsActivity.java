package com.example.bg994.hajjsproject;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera,39.8757357,1016m
        LatLng sydney = new LatLng(21.421763, 39.873238);
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15));
        // Instantiates a new Polyline object and adds points to define a rectangle
        PolygonOptions rectOptions = new PolygonOptions()
                .add(new LatLng(39.8734134, 21.425697))
                .add(new LatLng(39.8734175, 21.4257195))  // North of the previous point, but at the same longitude
                .add(new LatLng(39.8734671, 21.4257145))  // Same latitude, and 30km to the west
                .add(new LatLng(39.8734671, 21.4257807))
                .add(new LatLng(39.8734456, 21.4257906))
                .add(new LatLng(39.8733021, 21.4258019))
                .add(new LatLng(39.8732981, 21.4257882))
                .add(new LatLng(39.8730071, 21.4257919))
                .add(new LatLng(39.872826,  21.4257345))
                .add(new LatLng(39.8727483, 21.4256995))
                .add(new LatLng(39.8727402, 21.4256708))
                .add(new LatLng(39.8727402, 21.4255172))
                .add(new LatLng(39.8727711, 21.4254536))
                .add(new LatLng(39.873388,  21.4254436))
                .add(new LatLng(39.8733933, 21.4254536))
                .add(new LatLng(39.8733933, 21.425476))
                .add(new LatLng(39.8734215, 21.4254823))
                .add(new LatLng(39.8734134, 21.425697)); // Closes the polyline.
        rectOptions.fillColor(Color.RED);
// Get back the mutable Polyline
          mMap.addPolygon(rectOptions);
    }
}