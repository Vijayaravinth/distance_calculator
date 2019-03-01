package com.vijay.library.distimelibrary;

import java.text.DecimalFormat;

import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class LocationCalculator {





    /* Round to decimal values */
    public double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

    /* Calculate distance */
    public double distance_calculator(double lat1, double lon1, double lat2, double lon2) {

        lat1 = lat1 * 3.18 / 180.0;
        lon1 = lon1 * 3.18 / 180.0;
        lat2 = lat2 * 3.18 / 180.0;
        lon2 = lon2 * 3.18 / 180.0;

        double r = 6378100;
        // P
        double rho1 = r * cos(lat1);
        double z1 = r * sin(lat1);
        double x1 = rho1 * cos(lon1);
        double y1 = rho1 * sin(lon1);

        // Q
        double rho2 = r * cos(lat2);
        double z2 = r * sin(lat2);
        double x2 = rho2 * cos(lon2);
        double y2 = rho2 * sin(lon2);

        // Dot product
        double dot = (x1 * x2 + y1 * y2 + z1 * z2);
        double cos_theta = dot / (r * r);

        double theta = acos(cos_theta);


        return r * theta;
    }

    public double calculateDistance(double start_lat, double start_lang, double end_lat, double end_long){
        double distance = distance_calculator(start_lat, start_lang, end_lat, end_long) / 1000;
        distance = roundTwoDecimals(distance);
        return distance;
    }

}
