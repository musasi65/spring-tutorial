/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etagtest;

import java.util.Date;


/**
 *
 * @author 62552
 */
public class RealtimeTraveltime {
    
                private Date create_time;
	private int route_id;
                private int traveltime;
                private int flownum;
                
                public Date getCreatetime() {
                    
		return create_time;
	}
                        
        	public void setCreatetime(Date create_time) {
                        
                                this.create_time = create_time;                    
	}                
                
                
                                               
                public int getRoute_id() {
                    
		return route_id;
	}
        
        	public void setRoute_id(int route_id) {
                        
                                this.route_id = route_id;                    
	}
                
                
                                               
                public int getTraveltime() {
                    
		return traveltime;
	}
        
        	public void setTraveltime(int traveltime) {
                        
                                this.traveltime = traveltime;                    
	}                
                
                
                                               
                public int getFlownum() {
                    
		return flownum;
	}
        
        	public void setFlownum(int flownum) {
                        
                                this.flownum = flownum;                    
	}                                        
        
}
