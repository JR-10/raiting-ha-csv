package com.project.ranking.ports.aplication.http.mapper;

import com.project.ranking.domain.model.Project;
import com.project.ranking.ports.aplication.http.dto.response.ProjectResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProjectResponseMapper {

    ProjectResponseDto projectToProjectResponseDto(Project project);

    List<ProjectResponseDto> projectToProjectResponseDto(List<Project> project);
}
