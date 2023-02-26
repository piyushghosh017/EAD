/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package pkg1;

import java.beans.*;
public class StudentBean {
    String sname,susnno,sbranch;
    
    private String sampleProperty;
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname = sname;
    }
    public String getSusnno(){
        return susnno;
    }
    public void setSusnno(String susnno){
        this.susnno = susnno;
    }
    public String getSbranch(){
        return sbranch;
    }
    public void setSbranch(String sbranch){
        this.sbranch = sbranch;
    }
    
}
