package com.nzpmc.exam.backup.route;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nzpmc.exam.backup.model.ExamBackUp;
import com.nzpmc.exam.backup.repository.BackupExamRepository;

@RestController
@RequestMapping("examSubmissionsBackup")
public class ExamSubmissionRoute {

    @Autowired
    BackupExamRepository repository;

    /**
     * backUpSubmission will store: students email, event code and their exam
     * submission.
     * 
     */
    @PostMapping
    public ResponseEntity<?> submitExam(@RequestBody ExamBackUp backUpSubmission) {
        repository.save(backUpSubmission);
        return ResponseEntity.noContent().build();
    }

}
