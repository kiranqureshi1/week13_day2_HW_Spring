package com.codeclan.Anoonation.FileFoldersUsersHW.Repositories;

import com.codeclan.Anoonation.FileFoldersUsersHW.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FileRepository extends JpaRepository<File, Long> {
}
