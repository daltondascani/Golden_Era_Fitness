package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.model.Workouts


class Datasource {

    fun loadLegWorkouts(): List<Workouts> {
        return listOf(
            Workouts(R.string.Leg_Day1),
            Workouts(R.string.Leg_Day1_Spacing),
            Workouts(R.string.Leg_Day1_Workout1),
            Workouts(R.string.Leg_Day1_Workout2),
            Workouts(R.string.Leg_Day1_Workout3),
            Workouts(R.string.Leg_Day1_Workout4),
            Workouts(R.string.Leg_Day1_Workout5),
            Workouts(R.string.Leg_Day1_Spacing),
            Workouts(R.string.Leg_Day2),
            Workouts(R.string.Leg_Day1_Spacing),
            Workouts(R.string.Leg_Day2_Workout1),
            Workouts(R.string.Leg_Day2_Workout2),
            Workouts(R.string.Leg_Day2_Workout3),
            Workouts(R.string.Leg_Day2_Workout4),
            Workouts(R.string.Leg_Day2_Workout5)
        )
    }
    fun loadPushWorkouts(): List<Workouts> {
        return listOf(
            Workouts(R.string.Push_Day1),
            Workouts(R.string.Push_Day1_Spacing),
            Workouts(R.string.Push_Day1_Workout1),
            Workouts(R.string.Push_Day1_Workout2),
            Workouts(R.string.Push_Day1_Workout3),
            Workouts(R.string.Push_Day1_Workout4),
            Workouts(R.string.Push_Day1_Workout5),
            Workouts(R.string.Push_Day1_Spacing),
            Workouts(R.string.Push_Day2),
            Workouts(R.string.Push_Day1_Spacing),
            Workouts(R.string.Push_Day2_Workout1),
            Workouts(R.string.Push_Day2_Workout2),
            Workouts(R.string.Push_Day2_Workout3),
            Workouts(R.string.Push_Day2_Workout4),
            Workouts(R.string.Push_Day2_Workout5)
        )
    }
    fun loadPullWorkouts(): List<Workouts> {
        return listOf(
            Workouts(R.string.Pull_Day1),
            Workouts(R.string.Pull_Day1_Spacing),
            Workouts(R.string.Pull_Day1_Workout1),
            Workouts(R.string.Pull_Day1_Workout2),
            Workouts(R.string.Pull_Day1_Workout3),
            Workouts(R.string.Pull_Day1_Workout4),
            Workouts(R.string.Pull_Day1_Workout5),
            Workouts(R.string.Pull_Day1_Workout6),
            Workouts(R.string.Pull_Day1_Spacing),
            Workouts(R.string.Pull_Day2),
            Workouts(R.string.Pull_Day1_Spacing),
            Workouts(R.string.Pull_Day2_Workout1),
            Workouts(R.string.Pull_Day2_Workout2),
            Workouts(R.string.Pull_Day2_Workout3),
            Workouts(R.string.Pull_Day2_Workout4),
            Workouts(R.string.Pull_Day2_Workout5),
            Workouts(R.string.Pull_Day2_Workout6))
    }
}