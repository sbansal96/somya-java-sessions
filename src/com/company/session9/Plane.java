package com.company.session9;

import java.io.Serializable;

public class Plane implements Serializable {

    private static final long serialVersionUID = 3340164824848144194L;
    public int pId;
    public int planeNumber;

    public Plane(int pId, int planeNumber) {
        this.pId = pId;
        this.planeNumber = planeNumber;
    }
}
