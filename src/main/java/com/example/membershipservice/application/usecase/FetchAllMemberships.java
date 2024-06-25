package com.example.membershipservice.application.usecase;

import com.example.membershipservice.application.port.*;
import com.example.membershipservice.domain.model.*;
import java.util.List;

public class FetchAllMemberships {
    private MembershipRepository membershipRepository;

    public FetchAllMemberships(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }

    public List<Membership> execute() {
        return membershipRepository.findAll();
    }
}
