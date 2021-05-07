package com.example.web_pra.Controller;

import com.example.web_pra.Member;
import com.example.web_pra.MemberDTO;
import com.example.web_pra.Repository.MemberRepository;
import com.example.web_pra.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class MainController{
    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/member")
    public String insertMember(@RequestBody MemberDTO memberDTO){
        memberService.insertMember(memberDTO);
        return "Success";
    }

    @PutMapping("/member")
    public String updateMember(){
        memberService.updateMember();
        return "Success";
    }
    @DeleteMapping("/member")
    public String deleteMember(){
        memberService.deleteMember();
        return "Success";
    }

    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable Long id){
       Optional<Member> member =   memberRepository.findById(id);
       return member.get();
    }

}