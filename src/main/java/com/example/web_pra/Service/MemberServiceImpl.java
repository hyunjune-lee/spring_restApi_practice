package com.example.web_pra.Service;

import com.example.web_pra.Address;
import com.example.web_pra.Gender;
import com.example.web_pra.Member;
import com.example.web_pra.MemberDTO;
import com.example.web_pra.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    @Override
    public void insertMember(MemberDTO memberDTO) {
        Member member = new Member();

        String name = memberDTO.getName();
        member.setName(name);
        member.setGender(Gender.MALE);
        Address address = Address.builder()
                .address("천안")
                .zipCode("111-111")
                .telNo("010-1234-5678")
                .build();
        member.setAddress(address);

        memberRepository.save(member);
    }
    @Transactional
    @Override
    public void updateMember(){
        Member member =  memberRepository.findById(1L).get();
        member.setName("Hong");
    }

    @Transactional
    @Override
    public void deleteMember(){
        Member member =  memberRepository.findById(1L).get();
        memberRepository.delete(member);
    }
}
