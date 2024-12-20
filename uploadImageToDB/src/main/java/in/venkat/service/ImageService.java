package in.venkat.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.venkat.entity.Image;
import in.venkat.repository.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;
	
	public String saveImageToDB(MultipartFile image, String name,String description) throws IOException
	{
		Image i=new Image();
		i.setImage(image.getBytes());
		i.setName(name);
		i.setDescription(description);
		Image save = imageRepository.save(i);
		return "Image Saved"+save;
	}

}
