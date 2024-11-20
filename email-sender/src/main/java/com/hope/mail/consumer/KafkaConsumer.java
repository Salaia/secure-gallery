

package com.hope.mail.consumer;

import com.hope.mail.dto.EMailDto;
import com.hope.mail.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {
    private final MailService mailService;

    @KafkaListener(topics = "mail-topic", containerFactory = "kafkaEventListenerContainerFactory", groupId = "my-group-id")
    public void listen(EMailDto mailDto) {
        System.out.println("Kafka listens to mail events");
        mailService.sendEmail(mailDto);
    }


}

