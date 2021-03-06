package com.invoice.contratista.data.models.local

import com.invoice.contratista.utils.GlobalVariables
import java.time.LocalDate
import java.time.LocalTime

data class Date(
    val id: String,
    val day: LocalDate,
    val timeStart: LocalTime,
    val endTime: LocalTime,
    val complete: GlobalVariables.EventStatus,
    val location: String,
    val title: String,
    val note: String,
)