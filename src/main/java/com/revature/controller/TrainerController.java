package com.revature.controller;

import java.util.List;

import com.revature.model.Patient;
import com.revature.model.Trainer;

public interface TrainerController {

	List<Patient> getPokemon(Trainer trainer);
	
	public boolean loginTrainer(String username, String password);

	Trainer getProfile(Trainer trainer);

	Trainer updateProfile(Trainer trainer);
	
	public boolean registerTrainer(Trainer trainer);

}
