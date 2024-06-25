package com.example.membershipservice.application.port;

import com.example.membershipservice.domain.model.*;
import java.util.List;

public interface MembershipRepository {
    List<Membership> findAll();
}