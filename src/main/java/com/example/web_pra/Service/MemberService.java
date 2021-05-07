package com.example.web_pra.Service;

import com.example.web_pra.MemberDTO;

public interface MemberService {
    void insertMember(MemberDTO memberDTO);
    void updateMember();
    void deleteMember();
}
