package controller;

import model.Cirkel;

/**
 * @author Medy van Dijk <me.van.dijk@st.hanze.nl>
 * Uitwerking van opdracht
 * Doel:
 */
public class MeetkundeLauncher {


    public static void main(String[] args) {
        Cirkel mijnEersteCirkel = new Cirkel();
        mijnEersteCirkel.straal = 3;
        mijnEersteCirkel.middelpuntX = 3;
        mijnEersteCirkel.middelpuntY = -2;
        mijnEersteCirkel.kleur = "groen";
        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakte());



    }
}
