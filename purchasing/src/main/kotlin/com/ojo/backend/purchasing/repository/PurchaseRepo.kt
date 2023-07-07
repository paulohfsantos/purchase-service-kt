package com.ojo.backend.purchasing.repository

import com.ojo.backend.purchasing.models.Purchase
import org.springframework.data.jpa.repository.JpaRepository

interface PurchaseRepo: JpaRepository<Purchase, Long> {}