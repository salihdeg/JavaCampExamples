package business;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya eklendi!");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya düzenlendi!");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya silindi!");
		
	}

}
