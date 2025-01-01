package com.ll.chat_pr.domain.home.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName    : com.ll.chat_pr.domain.home.main.controller
 * fileName       : ChatController
 * author         : sungjun
 * date           : 2025-01-01
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-01        kyd54       최초 생성
 */
@Controller
@RequestMapping("/chat")
public class ChatController {

    //  GET /chat/room/list : 채팅방 목록 조회
    @GetMapping("/room/list")
    public String ChatRoomListPage() {
        return "domain/chat/chatRoom/list";
    }

    //  GET /chat/room/make : 채팅방 생성 페이지
    @GetMapping("/room/make")
    public String ChatRoomMakePage() {
        return "domain/chat/chatRoom/make";
    }

    //  POST /chat/room/make : 채팅방 생성
    @PostMapping("/room/make")
    public String ChatRoomMake() {
        return "redirect:/chat/room/list";
    }

    //  GET /chat/room/{roomId} : 채팅방 입장
    @GetMapping("/room")
    public String ChatRoomPage() {
        return "domain/chat/chatRoom/room";
    }

    //  POST /chat/room/{roomId}/write : 메시지 작성
    @PostMapping("/room/write")
    public String ChatRoomWrite() {
        return "redirect:/chat/room";
    }

    //  GET /chat/room/{roomId}/messagesAfter/{afterId} : 채팅방 메시지 조회
    @GetMapping("/room/messagesAfter")
    public String ChatRoomMessagesAfter() {
        return "domain/chat/chatRoom/room";
    }
}
