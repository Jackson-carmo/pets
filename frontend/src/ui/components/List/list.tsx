import { Button } from '@mui/material';
import {
    ListStyled,
    ItemList,
    Image,
    Information,
    Name,
    Description
} from './list.style'
import { Pet } from '../../../data/@types/pet'
import { TextService } from '../../../data/services/textService'

interface ListProps {
    pets:Pet[];
    onSelect: (pet: Pet) => void;
}

export default function List(props: ListProps) {
    const tamanhoMaximoTexto = 200;

    return (
        <ListStyled>
            {props.pets.map(pet => (
                <ItemList key={pet.id} >
                    <Image src={pet.foto}  />
                    <Information>
                        <Name>{pet.nome}</Name>
                        <Description>
                            {TextService.limitarTexto(pet.historia, tamanhoMaximoTexto)}
                        </Description>
                        <Button
                            variant={'contained'}
                            fullWidth
                            onClick={() => props.onSelect(pet)}
                        >
                            Adotar {pet.nome}
                        </Button>
                    </Information>
                </ItemList>
            ))}
            
        </ListStyled>
    );
}