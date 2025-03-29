package com.nzpmc.exam.backup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class ExamBackUp {

    @Id
    private String id;

    private String studentEmail;

    private String eventCode;

    private Object examSubmission;

}
