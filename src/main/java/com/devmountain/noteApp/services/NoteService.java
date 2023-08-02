package com.devmountain.noteApp.services;

import java.util.List;
import java.util.Optional;

import com.devmountain.noteApp.dtos.NoteDto;

import jakarta.transaction.Transactional;

public interface NoteService {

    void addNote(NoteDto noteDto, Long userId);

    void deleteNoteById(Long noteId);

    void updateNoteById(NoteDto noteDto);

    List<NoteDto> getAllNotesByUserId(Long userId);

    Optional<NoteDto> getNoteById(Long noteId);

}