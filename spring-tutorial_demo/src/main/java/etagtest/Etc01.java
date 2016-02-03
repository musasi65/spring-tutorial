/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etagtest;



import java.util.Date;

import com.ibm.icu.text.SimpleDateFormat;
/**
 *
 * @author 62552
 */
public class Etc01 {
    
        private int key_id;
        private String epc;
        private String tid;
        private int station;
        private int lane;
        private int vehicles;
        private String direction;
        private Date stag_time;
        private String system_time;    
         
//        
//    	private String uid;
//	private String belong;

	public int getKey_id() {
		return key_id;
	}
        
        	public void setKey_id(int key_id) {
                        
                                this.key_id = key_id;                    
	}
                
	public String getEpc() {
            
		return epc;
	}
        
        	public void seEpc(String epc) {
                        
                                this.epc = epc;
                }                
                
                
	public int getLane() {
            
		return lane;
	}
        
        	public void seLane(int lane) {
                        
                                this.lane = lane;                    
	}               

                
                public int getStation() {
                    
		return station;
	}
                public void setStation() {
                    
		this.station = station;        
	}     
                
	public String getDirection() {
            
		return direction;
	}                     
                
                public void setDirection() {
                    
		this.direction =direction;        
	}                
                        
                public Date getTagtime() {
            
		return stag_time;
	}                     
                
                public void setTagtime() {
                    
		this.stag_time =stag_time;        
	}   
                

        
        

}
