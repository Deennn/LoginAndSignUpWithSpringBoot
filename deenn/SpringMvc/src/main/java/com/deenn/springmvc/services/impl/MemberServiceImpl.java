package com.deenn.springmvc.services.impl;

import com.deenn.springmvc.dtos.LoginDto;
import com.deenn.springmvc.dtos.MemberDto;
import com.deenn.springmvc.entity.Member;
import com.deenn.springmvc.repositories.MemberRepository;
import com.deenn.springmvc.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {


    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void createMember(MemberDto memberDto) {

        Member member = new Member();
        member.setName(memberDto.getName());
        member.setEmail(memberDto.getEmail());
        member.setPassword(memberDto.getPassword());
        memberRepository.save(member);

    }

    @Override
    public Member login(LoginDto loginDto) {

        Optional<Member> member = memberRepository.findByEmail(loginDto.getEmail());
        if (member.isPresent()) {
           Member presentMember = member.get();
           if (presentMember.getPassword().equals(loginDto.getPassword()))
               return presentMember;
        }
        return null;
    }
}
