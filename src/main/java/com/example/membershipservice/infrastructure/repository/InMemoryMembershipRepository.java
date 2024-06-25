package com.example.membershipservice.infrastructure.repository;

import com.example.membershipservice.application.port.*;
import com.example.membershipservice.domain.model.*;
import java.util.ArrayList;
import java.util.List;

public class InMemoryMembershipRepository implements MembershipRepository {
    private List<Membership> memberships = new ArrayList<>();

    public InMemoryMembershipRepository() {
        memberships.add(new Membership(1L, "Mensual", 100, 15));
        memberships.add(new Membership(2L, "Anual", 400, 25));
    }

    @Override
    public List<Membership> findAll() {
        return new ArrayList<>(memberships);
    }
}