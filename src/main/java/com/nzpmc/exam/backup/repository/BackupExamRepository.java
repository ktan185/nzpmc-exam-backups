package com.nzpmc.exam.backup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nzpmc.exam.backup.model.ExamBackUp;

public interface BackupExamRepository extends MongoRepository<ExamBackUp, String> {

}
