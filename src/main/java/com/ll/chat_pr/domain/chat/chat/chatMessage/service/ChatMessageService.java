package com.ll.chat_pr.domain.chat.chat.chatMessage.service;

import com.ll.chat_pr.domain.chat.chat.chatMessage.entity.ChatMessage;
import com.ll.chat_pr.domain.chat.chat.chatMessage.repository.ChatMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public List<ChatMessage> findByChatRoomIdAndIdAfter(long roomId, long afterId) {
        return chatMessageRepository.findByChatRoomIdAndIdAfter(roomId, afterId);
    }
}