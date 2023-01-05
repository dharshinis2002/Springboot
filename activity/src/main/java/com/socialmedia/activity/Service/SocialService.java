package com.socialmedia.activity.Service;

import com.socialmedia.activity.Entity.Social;
import com.socialmedia.activity.DTO.SocialDTO;
import com.socialmedia.activity.Repository.SocialRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialService {
    @Autowired
    private SocialRepository socialRepository;

    // private ModelMapper modelMapper = new ModelMapper();
//DAO to DTO
    //  public SocialDTO convertSocialDAOtoSocialDTO(Social socialDAO) {
    //    return modelMapper.map(socialDAO, SocialDTO.class);
    //  }
    //   DTO to DAO

    //   public Social convertToSocialDTOtoSocialDAO(SocialDTO socialDTO) {
    //      return modelMapper.map(socialDTO, Social.class);
    //  }

    //save


//    public ArrayList<SocialDTO> getAllActivity() {
//        List<Social> socialDAOS = socialRepository.findAll();
//        ArrayList<SocialDTO> socialDTOs = new ArrayList<SocialDTO>();
//
//        for (Social socialDAO : socialDAOS) {
//            socialDTOs.add(this.convertSocialDAOtoSocialDTO(socialDAO));
//        }
//    return socialDTOs;
//}
//}

}