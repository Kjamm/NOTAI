package com.iguana.domain.repository

import com.iguana.domain.model.ai.AIResult
import com.iguana.domain.model.ai.AIStatusResult

interface AIRepository {
    // 요약 생성
    suspend fun requestSummarization(documentId: Long, pages: List<Int>): Result<Unit>

    // 요약 상태 확인
    suspend fun checkStatus(documentId: Long): Result<AIStatusResult>

    // 요약 결과 조회
    suspend fun getSummarization(documentId: Long): Result<List<AIResult>>

}