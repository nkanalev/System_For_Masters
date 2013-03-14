/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_project;

import ai_project.Algorithm.Pair;
import java.util.Vector;


public class AI_Project {

    public Pair<String,Float> giveAndGet(Vector<Pair<String, Integer>> myDisciplines)
    {
        Algorithm alg = new Algorithm();
        Pair<String,Float> result = alg.KNNAlgorithm(myDisciplines);
        return result;
    }
    public static void main(String[] args) {
        GUI g = new GUI();
        g.setVisible(true);
    }
}
