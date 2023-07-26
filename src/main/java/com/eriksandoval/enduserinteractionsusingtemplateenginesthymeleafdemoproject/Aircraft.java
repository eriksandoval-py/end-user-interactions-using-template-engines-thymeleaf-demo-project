package com.eriksandoval.enduserinteractionsusingtemplateenginesthymeleafdemoproject;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty; 

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // This tells Hibernate to make a table out of this class.
@Data // Lombok annotation to create all the getters, setters, equals, hash, and toString methods. 
@NoArgsConstructor // Lombok annotation to create a constructor with no parameters.
@AllArgsConstructor // Lombok annotation to create a constructor with all parameters.
public class Aircraft {

    // The following variables are the columns in the database table.
    @Id // This makes the id variable the primary key.
    private long id;
    private String callsign, squawk, reg, flightno, route, type, category;
    private int altitude, heading, speed;
    @JsonProperty("vert_rate") // This is needed because the JSON property is vert_rate, but the variable name is vertRate.
    private int vertRate;
    @JsonProperty("selected_altitude") // See above comment, applies to remaining. 
    private int selectedAltitude;
    private double lat, lon, barometer;
    @JsonProperty("polar_distance")
    private double polarDistance;
    @JsonProperty("polar_bearing")
    private double polarBearing;
    @JsonProperty("is_adsb")
    private boolean isADSB;
    @JsonProperty("is_on_ground")
    private boolean isOnGround;
    @JsonProperty("last_seen_time")
    private Instant lastSeenTime;
    @JsonProperty("pos_update_time")
    private Instant posUpdateTime;
    @JsonProperty("bds40_seen_time")
    private Instant bds40SeenTime;
    
}
