package etagtest;

import demo.backend.jdbc.*;

public class Etc01_2travel_time {
	private int key_id;
	private String epc;
        private String tid;
        private String station;
        private String lane;
        private String vehicles;
        private String direction;
        private String etag_time;
        private String system_time;

	public String getEpc() {
		return epc;
	}

//	public void setUid(String uid) {
//		this.uid = uid;
//	}

	public String getStation() {
		return station;
	}

//	public void setBelong(String belong) {
//		this.belong = belong;
//	}
	public String getEtag_time() {
		return etag_time;
	}
}
