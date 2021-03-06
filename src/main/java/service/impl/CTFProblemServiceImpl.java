package service.impl;

import dao.CTFProblemDAO;
import entity.CTFFlagGetter;
import entity.CTFProblem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CTFProblemService;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by WaterMelon on 2017/11/8.
 */
@Service(value = "CTFProblemService")
@Transactional
public class CTFProblemServiceImpl implements CTFProblemService {
    private final CTFProblemDAO ctfProblemDAO;
    @Autowired
    public CTFProblemServiceImpl(CTFProblemDAO ctfProblemDAO) {
        this.ctfProblemDAO = ctfProblemDAO;
    }

    @Override
    public List<CTFProblem> getAllCTFProblems() {
        return ctfProblemDAO.getAllCTFProblems();
    }

    @Override
    public List<CTFProblem> getCTFProblemsByName(String name) {
        return getCTFProblemsByName(name);
    }

    @Override
    public List<CTFFlagGetter> getAllCTFFlagGetter() {
        return ctfProblemDAO.getAllCTFFlagGetter();
    }

    @Override
    public List<CTFFlagGetter> getCTFFlagGetterByID(int id) {
        return ctfProblemDAO.getCTFFlagGetterByID(id);
    }

    @Override
    public CTFProblem getCTFProblemByID(int id) {
        return ctfProblemDAO.getCTFProblemByID(id);
    }

    @Override
    public void addCTFProblem(CTFProblem ctfProblem) {
        ctfProblemDAO.addCTFProblem(ctfProblem);
    }

    @Override
    public boolean deleteCTFProblem(int id) {
       return ctfProblemDAO.deleteCTFProblem(id);
    }

    @Override
    public void updateCTFProblem(CTFProblem ctfProblem) {
        ctfProblemDAO.updateCTFProblem(ctfProblem);
    }

    @Override
    public void addCTFFlagGetter(CTFFlagGetter ctfFlagGetter) {

    }
}
