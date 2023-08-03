package com.likelion.honeyBottle.controller;

import com.likelion.honeyBottle.domain.Dto.ActivityDto;
import com.likelion.honeyBottle.domain.Activity;
import com.likelion.honeyBottle.domain.Dto.EatDto;
import com.likelion.honeyBottle.domain.Dto.PlaceDto;
import com.likelion.honeyBottle.domain.Eat;
import com.likelion.honeyBottle.domain.Place;
import com.likelion.honeyBottle.repository.ActivityRepository;
import com.likelion.honeyBottle.repository.EatRepository;
import com.likelion.honeyBottle.repository.PlaceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    private final ActivityRepository activityRepository;
    private final EatRepository eatRepository;
    private final PlaceRepository placeRepository;

    public MainController(ActivityRepository activityRepository, EatRepository eatRepository, PlaceRepository placeRepository) {
        this.activityRepository = activityRepository;
        this.eatRepository = eatRepository;
        this.placeRepository = placeRepository;
    }

    @GetMapping("/activities")
    public List<Activity> getActivities() {
        return activityRepository.findAll();
    }

    @GetMapping("/eats")
    public List<Eat> getEats() {
        return eatRepository.findAll();
    }

    @GetMapping("/places")
    public List<Place> getPlaces() {
        return placeRepository.findAll();
    }

    @PostMapping("/activities")
    public ResponseEntity<Activity> createActivity(@RequestBody ActivityDto activityDto) {
        Activity activity = new Activity();
        activity.setTitle(activityDto.getTitle());
        activity.setContent(activityDto.getContent());
        activity.setState(activityDto.getState());
        activity.setAddress(activityDto.getAddress());
        activity.setUrl(activityDto.getUrl());
        activity.setMapUrl(activityDto.getMapUrl());

        Activity savedActivity = activityRepository.save(activity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedActivity);
    }

    @PostMapping("/eats")
    public ResponseEntity<Eat> createEat(@RequestBody EatDto eatDto) {
        Eat eat = new Eat();
        eat.setTitle(eatDto.getTitle());
        eat.setContent(eatDto.getContent());
        eat.setState(eatDto.getState());
        eat.setAddress(eatDto.getAddress());
        eat.setUrl(eatDto.getUrl());
        eat.setMapUrl(eatDto.getMapUrl());

        Eat savedEat = eatRepository.save(eat);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEat);
    }

    @PostMapping("/places")
    public ResponseEntity<Place> createPlace(@RequestBody PlaceDto placeDto) {
        Place place = new Place();
        place.setTitle(placeDto.getTitle());
        place.setContent(placeDto.getContent());
        place.setState(placeDto.getState());
        place.setAddress(placeDto.getAddress());
        place.setUrl(placeDto.getUrl());
        place.setMapUrl(placeDto.getMapUrl());

        Place savedPlace = placeRepository.save(place);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPlace);
    }
}