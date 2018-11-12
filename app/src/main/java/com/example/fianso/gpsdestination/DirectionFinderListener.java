package com.example.fianso.gpsdestination;

import java.util.List;

interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
