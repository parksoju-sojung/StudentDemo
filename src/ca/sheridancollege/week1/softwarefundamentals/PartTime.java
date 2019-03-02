/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author spark
 */
public class PartTime extends StudentDemo {
    
    public int numOfCourse;
    
    public PartTime(String id, String name, int n) {
        super(id, name);
        this.numOfCourse = n;
    }
}
