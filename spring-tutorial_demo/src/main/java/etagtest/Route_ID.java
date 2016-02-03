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
public class Route_ID {
                private int route_id;
	private String road_name;
                private String direction;
                private String route_name;
                private int start_side_id;
                private int end_side_id;
                private int dist;
                private String type;

                
                
                public int getRoute_id() {
		return route_id;
	}
        
        	public void setRoute_id(int route_id) {
                        
                                this.route_id = route_id;                    
	}                
                
                
                
                public String getRoad_name() {
		return road_name;
	}
        
        	public void setRoad_name(String road_name) {
                        
                                this.road_name = road_name;                    
	}                                
	
                
                
	public String getDirection() {
            
		return direction;
	}                     
                
                public void setDirection() {
                    
		this.direction =direction;        
	}                
                
                
                
                public int getStartsite() {
                    
		return start_side_id;
	}
                public void setStartsite() {
                    
		this.start_side_id =start_side_id;        
	}                     

                
                
                public int getENDsite() {
                    
		return end_side_id;
	}
                public void setENDsite() {
                    
		this.end_side_id =end_side_id;        
	}                                     

                
                
                public int setDist() {
		return dist;
	}
        
        	public void setDist(int dist) {
                        
                                this.dist=dist;                
	}    
                
                
                
                public String getType() {
		return type;
	}
        
        	public void setType(String type) {
                        
                                this.type = type;                    
	}                        
             
}
