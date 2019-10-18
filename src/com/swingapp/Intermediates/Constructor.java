package com.swingapp.Intermediates;

import com.swingapp.Intermediates.models.Machine;

public class Constructor {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Sewing");
        Machine machine3 = new Machine("Sewing", "Electric");
    }
}
