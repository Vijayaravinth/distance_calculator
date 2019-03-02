1. Find a Distance between two location without using googls APi's.
2. Get most accurate result.

//Sample : 
        LocationCalculator calculate = new LocationCalculator();

        double distance = calculate.calculateDistance(13.049203, 77.505779,13.013005, 77.579918);
        Log.w(TAG,"distance : "+ distance);

        TextView txtDistance  = (TextView) findViewById(R.id.txtDistance);

        txtDistance.setText("Distance between the location is "+ distance+"kms");
        
        TextView txtTime = (TextView) findViewById(R.id.txtTime);

        String time = calculate.calculateTime(distance, 30.0F);

        txtTime.setText("Time to reach  : " + time);
