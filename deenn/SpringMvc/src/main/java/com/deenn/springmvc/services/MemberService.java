package com.deenn.springmvc.services;

import com.deenn.springmvc.dtos.LoginDto;
import com.deenn.springmvc.dtos.MemberDto;
import com.deenn.springmvc.entity.Member;

public interface MemberService {

    void createMember(MemberDto memberDto);
    Member login(LoginDto loginDto);

}
