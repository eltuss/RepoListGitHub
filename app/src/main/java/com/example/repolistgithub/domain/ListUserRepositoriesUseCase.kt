package com.example.repolistgithub.domain

import com.example.repolistgithub.core.UseCase
import com.example.repolistgithub.data.model.Repo
import com.example.repolistgithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}