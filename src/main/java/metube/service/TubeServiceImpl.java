package metube.service;

import metube.domain.enitities.Tube;
import metube.domain.models.service.TubeServiceModel;
import metube.repository.TubeRepository;
import metube.util.ModelMapper;

import javax.inject.Inject;

public class TubeServiceImpl implements TubeService {

    private final TubeRepository tubeRepository;
    private final ModelMapper modelMapper;

    @Inject
    public TubeServiceImpl(TubeRepository tubeRepository, ModelMapper modelMapper) {
        this.tubeRepository = tubeRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public void saveTube(TubeServiceModel tubeServiceModel) {
        this.tubeRepository
                .save(this.modelMapper.map(tubeServiceModel, Tube.class));
    }
}
