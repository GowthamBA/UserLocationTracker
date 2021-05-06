/**package com.example.userlocationtracker;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final int REQUEST_LOCATION = 1;
    LocationManager locationManager;
    String latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            OnGPS();
        } else {
            getLocation();
        }
    }*/

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    /**@Override
    public void onMapReady(GoogleMap googleMap) {
    mMap = googleMap;

    // Add a marker in Sydney and move the camera
    LatLng sydney = new LatLng(-34, 151);
    mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
    mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }*/
/**
    private void OnGPS() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Enable GPS").setCancelable(false).setPositiveButton("Yes", new  DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void getLocation() {
        if (ActivityCompat.checkSelfPermission(
                MapsActivity.this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                MapsActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        } else {
            Location locationGPS = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (locationGPS != null) {
                double lat = locationGPS.getLatitude();
                double longi = locationGPS.getLongitude();
                latitude = String.valueOf(lat);
                longitude = String.valueOf(longi);
            } else {
                Toast.makeText(this, "Unable to find location.", Toast.LENGTH_SHORT).show();
            }
        }
    }
 @Override
 public void onMapReady(GoogleMap googleMap) {
 mMap = googleMap;
 // Add a marker in Sydney and move the camera
 LatLng sydney = new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude));
 mMap.addMarker(new MarkerOptions().position(sydney).title("You are Here"));
 mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
 }
}*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/**import androidx.annotation.NonNull;
 import androidx.core.app.ActivityCompat;
 import androidx.fragment.app.FragmentActivity;

 import android.Manifest;
 import android.annotation.SuppressLint;
 import android.content.pm.PackageManager;
 import android.location.Location;
 import android.location.LocationProvider;
 import android.nfc.Tag;
 import android.os.Bundle;
 import android.util.Log;
 import android.widget.Toast;

 import com.google.android.gms.common.api.GoogleApiClient;
 import com.google.android.gms.location.FusedLocationProviderClient;
 import com.google.android.gms.location.LocationRequest;
 import com.google.android.gms.location.LocationServices;
 import com.google.android.gms.maps.CameraUpdateFactory;
 import com.google.android.gms.maps.GoogleMap;
 import com.google.android.gms.maps.OnMapReadyCallback;
 import com.google.android.gms.maps.SupportMapFragment;
 import com.google.android.gms.maps.model.LatLng;
 import com.google.android.gms.maps.model.MarkerOptions;
 import com.google.android.gms.tasks.OnCompleteListener;
 import com.google.android.gms.tasks.OnSuccessListener;
 import com.google.android.gms.tasks.Task;
 import com.google.android.material.tabs.TabLayout;

 public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

 private static final String TAG = "MapActivity";
 private static final String FINE_LOCATION=Manifest.permission.ACCESS_FINE_LOCATION;
 private static final String COURSE_LOCATION=Manifest.permission.ACCESS_COARSE_LOCATION;
 private static final int LOCATION_PERMISSION_REQUEST_CODE =1234;
 private static final float DEFAULT_ZOOM=15f;
 private GoogleMap mMap;

 private FusedLocationProviderClient mfusedLocationProviderClient;
 //boolean isPermissionGranted;
 //Location mlocation;
 //private static final int Request_Code = 101;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_maps);

 //fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
 //createLocationRequest();
 //GetLastLocation();

 /**if(isPermissionGranted){
 // Obtain the SupportMapFragment and get notified when the map is ready to be used.
 SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
 mapFragment.getMapAsync(this);
 }*/
/**    }



 private void getDeviceLocation(){
 Log.d(TAG,"getDeviceLocation: getting the device current location");
 mfusedLocationProviderClient =LocationServices.getFusedLocationProviderClient(this);
 try {
 Task loc=mfusedLocationProviderClient.getLastLocation();
 loc.addOnCompleteListener(new OnCompleteListener() {
@Override
public void onComplete(@NonNull Task task) {
if(task.isSuccessful()){
Log.d(TAG,"onComplete : found Location");
Location currentLocation=(Location) task.getResult();

moveCamera(new LatLng(currentLocation.getLatitude(),currentLocation.getLongitude()),DEFAULT_ZOOM);
}else {
Log.d(TAG, "onComplete : Current location is null");
Toast.makeText(MapsActivity.this, "Unable to get current location.", Toast.LENGTH_SHORT).show();
}
}
});
 }
 catch (SecurityException e){
 Log.e(TAG,"getDeviceLocation: SecurityException"+e.getMessage());
 }
 }

 private void moveCamera(LatLng latLng,float zoom){
 Log.d(TAG,"moveCamera : moving the camera to : lat : "+latLng.latitude +", lng :"+latLng.longitude);
 mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,zoom));
 }

 /**protected void createLocationRequest() {
 LocationRequest locationRequest = LocationRequest.create();
 locationRequest.setInterval(10000);
 locationRequest.setFastestInterval(5000);
 locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
 }*/

/**private void GetLastLocation() {
 if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
 && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
 ActivityCompat.requestPermissions(this,new String[]
 {Manifest.permission.ACCESS_FINE_LOCATION},Request_Code);
 return;
 }
 Task<Location> task = fusedLocationProviderClient.getLastLocation();
 task.addOnSuccessListener(new OnSuccessListener<Location>() {
@Override
public void onSuccess(Location location) {
if(location != null){
mlocation=location;
Toast.makeText(getApplicationContext(),mlocation.getLatitude()+""+mlocation.getLongitude(),Toast.LENGTH_SHORT).show();
SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
mapFragment.getMapAsync(MapsActivity.this);
}
}
});
 }*/



/**
 * Manipulates the map once available.
 * This callback is triggered when the map is ready to be used.
 * This is where we can add markers or lines, add listeners or move the camera. In this case,
 * we just add a marker near Sydney, Australia.
 * If Google Play services is not installed on the device, the user will be prompted to install
 * it inside the SupportMapFragment. This method will only be triggered once the user has
 * installed Google Play services and returned to the app.
 */

/**
 //@SuppressLint("MissingPermission")
 @Override
 public void onMapReady(GoogleMap googleMap) {
 mMap = googleMap;
 getDeviceLocation();
 //mMap.setMyLocationEnabled(true);
 /**LatLng latLng=new LatLng(mlocation.getLatitude(),mlocation.getLongitude());
 MarkerOptions markerOptions=new MarkerOptions().position(latLng).title("You Are Here");
 googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
 googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,6));
 googleMap.addMarker(markerOptions);*/
//  }

/**@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
switch (requestCode){
case Request_Code:
if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED){
GetLastLocation();
}
break;
}
}*/
//}