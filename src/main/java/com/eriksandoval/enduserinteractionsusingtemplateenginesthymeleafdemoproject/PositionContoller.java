package com.eriksandoval.enduserinteractionsusingtemplateenginesthymeleafdemoproject;

import org.springframework.stereotype.Controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // Lombok annotation to create a constructor with all final fields.
@Controller // This tells Spring that this class is set as a Controller.
public class PositionContoller {
    @NonNull // Lombok annotation to create a constructor with all final fields.
    private final AircraftRepository aircraftRepository;
    
    
    
}
