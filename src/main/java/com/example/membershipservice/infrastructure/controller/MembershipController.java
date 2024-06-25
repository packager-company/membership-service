package com.example.membershipservice.infrastructure.controller;

import com.example.membershipservice.application.usecase.*;
import com.example.membershipservice.domain.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/memberships")
public class MembershipController {
    private FetchAllMemberships fetchAllMemberships;

    public MembershipController(FetchAllMemberships fetchAllMemberships) {
        this.fetchAllMemberships = fetchAllMemberships;
    }

    @GetMapping
    public List<Membership> getAllMemberships() {
        return fetchAllMemberships.execute();
    }
}