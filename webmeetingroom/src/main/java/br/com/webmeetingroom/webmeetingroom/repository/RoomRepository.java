package br.com.webmeetingroom.webmeetingroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webmeetingroom.webmeetingroom.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
